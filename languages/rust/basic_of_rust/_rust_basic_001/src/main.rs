use std::io;

fn main() {
    println!("Hello, World!");
    println!("Enter your name:");

    let mut name = String::new();
    
    io::stdin().read_line(&mut name).expect("Failed to read line");
    println!("Hello, {}!", name.trim());

    let mut second_name = String::new();
    io::stdin().read_line(&mut second_name).expect("Failed to read line");

    println!("Hello, {}!", second_name.trim());
}

/*

use std::io;

fn main() {
    println!("Enter your name: ");
    let mut name = String::new();
    io::stdin().read_line(&mut name).expect("Failed to read line");
    println!("Hello, {}!", name.trim());
}

*/
