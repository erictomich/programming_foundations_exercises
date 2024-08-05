#include <windows.h>

const int BOARD_SIZE = 8;
const int SQUARE_SIZE = 60;

LRESULT CALLBACK WindowProc(HWND hwnd, UINT uMsg, WPARAM wParam, LPARAM lParam) {
    static HBRUSH blackBrush;
    static HBRUSH whiteBrush;

    switch (uMsg) {
        case WM_CREATE:
            blackBrush = CreateSolidBrush(RGB(0, 0, 0));
            whiteBrush = CreateSolidBrush(RGB(255, 255, 255));
            return 0;
        
        case WM_PAINT: {
            PAINTSTRUCT ps;
            HDC hdc = BeginPaint(hwnd, &ps);

            for (int row = 0; row < BOARD_SIZE; ++row) {
                for (int col = 0; col < BOARD_SIZE; ++col) {
                    RECT square;
                    square.left = col * SQUARE_SIZE;
                    square.top = row * SQUARE_SIZE;
                    square.right = square.left + SQUARE_SIZE;
                    square.bottom = square.top + SQUARE_SIZE;

                    HBRUSH brush = ((row + col) % 2 == 0) ? whiteBrush : blackBrush;
                    FillRect(hdc, &square, brush);
                }
            }

            EndPaint(hwnd, &ps);
            return 0;
        }
        
        case WM_DESTROY:
            DeleteObject(blackBrush);
            DeleteObject(whiteBrush);
            PostQuitMessage(0);
            return 0;
    }
    
    return DefWindowProc(hwnd, uMsg, wParam, lParam);
}

int WINAPI WinMain(HINSTANCE hInstance, HINSTANCE hPrevInstance, LPSTR lpCmdLine, int nCmdShow) {
    const char CLASS_NAME[] = "ChessBoardWindowClass";
    
    WNDCLASS wc = {};
    wc.lpfnWndProc = WindowProc;
    wc.hInstance = hInstance;
    wc.lpszClassName = CLASS_NAME;
    
    RegisterClass(&wc);

    HWND hwnd = CreateWindowEx(
        0, CLASS_NAME, "Chess Board", WS_OVERLAPPEDWINDOW,
        CW_USEDEFAULT, CW_USEDEFAULT, BOARD_SIZE * SQUARE_SIZE, BOARD_SIZE * SQUARE_SIZE,
        NULL, NULL, hInstance, NULL
    );

    if (hwnd == NULL) {
        return 0;
    }

    ShowWindow(hwnd, nCmdShow);
    UpdateWindow(hwnd);

    MSG msg;
    while (GetMessage(&msg, NULL, 0, 0)) {
        TranslateMessage(&msg);
        DispatchMessage(&msg);
    }

    return 0;
}
