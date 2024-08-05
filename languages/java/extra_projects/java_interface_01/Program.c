#include <stdio.h>
#include <windows.h>

int main() {
    STARTUPINFO si;
    PROCESS_INFORMATION pi;
    ZeroMemory(&si, sizeof(si));
    si.cb = sizeof(si);
    si.dwFlags = STARTF_USESHOWWINDOW;
    si.wShowWindow = SW_HIDE;  // Oculta a janela do terminal

    ZeroMemory(&pi, sizeof(pi));

    // Cria o processo para executar o arquivo .bat
    if (!CreateProcess(NULL, "cmd.exe /c KeyPressExample.bat", NULL, NULL, FALSE, 0, NULL, NULL, &si, &pi)) {
        fprintf(stderr, "CreateProcess failed (%d).\n", GetLastError());
        return 1;
    }

    // Espera o processo terminar
    WaitForSingleObject(pi.hProcess, INFINITE);

    // Fecha os handles do processo e thread
    CloseHandle(pi.hProcess);
    CloseHandle(pi.hThread);

    return 0;
}
