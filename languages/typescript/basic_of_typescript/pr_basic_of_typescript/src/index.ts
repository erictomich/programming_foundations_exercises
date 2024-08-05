function greet(name: string): string {
    return `Hello, ${name}!`
}

console.log(greet("World"))

/*

const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter your name: ', (name: string) => {
    console.log(`Hello, ${name}!`);
    readline.close();
});

*/