#include <iostream>
#include <string>

int main() {
    std::string name;
    std::string second_name;
    std::string home_place;

    std::cout << "Hello, World! \n" << std::endl;
    std::cout << "Enter your name: ";
    std::cin >> name;
    std::cout << "My name is " << name << "!" << std::endl;

    std::cout << "Enter your second name: ";
    std::cin >> second_name;

    std::cout << "My name is " << name << " " << second_name << "\n";

    std::cout << "Where do you live? ";
    std::cin.ignore(); // Ignora o caractere de nova linha anterior
    std::getline(std::cin, home_place);

    std::cout << "I live in " << home_place;


    std::cout << "Press any key for close the program...";
    std::cin.get(); // Aguarda o usuário pressionar Enter

    return 0;
}