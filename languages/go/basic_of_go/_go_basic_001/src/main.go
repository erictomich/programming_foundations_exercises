package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	fmt.Println("Hello, World!")
	reader := bufio.NewReader(os.Stdin)

	fmt.Print("Enter your name: ")
	name, _ := reader.ReadString('\n')
	name = strings.TrimSpace(name) // Remove espaços em branco, incluindo o '\n'
	fmt.Printf("Hello, %s! \n", name)

	fmt.Print("Enter your second name: ")
	secondName, _ := reader.ReadString('\n')
	secondName = strings.TrimSpace(secondName) // Remove espaços em branco, incluindo o '\n'
	fmt.Printf("Your complete name is: %s %s !", name, secondName)

	fmt.Println("Digite qualquer tecla para finalizar...")
	reader.ReadString('\n')
}
