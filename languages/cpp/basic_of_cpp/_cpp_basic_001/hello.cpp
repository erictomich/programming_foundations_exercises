#include <iostream>
#include <string>

int main() {
    std::string name;
    std::string second_name;

    std::cout << "Hello, World! \n" << std::endl;
    std::cout << "Enter your name: ";
    std::cin >> name;
    std::cout << "My name is " << name << "!" << std::endl;

    std::cout << "Enter your second name: ";
    std::cin >> second_name;

    std::cout << "My name is " << name << " " << second_name;

    std::cout << "Press any key for close the program...";
    std::cin.ignore(); // Ignora o caractere de nova linha que ficou no buffer
    std::cin.get(); // Aguarda o usuário pressionar Enter

    return 0;
}