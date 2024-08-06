import * as readline from 'readline';

// Função auxiliar para fazer uma pergunta e retornar uma Promise
const question = (rl: readline.Interface, query: string): Promise<string> => {
  return new Promise((resolve) => {
    rl.question(query, (answer) => {
      resolve(answer);
    });
  });
};

const main = async () => {
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  console.log("Hello World!");

  try {
    const name = await question(rl, "Enter your name: ");
    console.log(`Hello, ${name}!`);
    
    const secondName = await question(rl, "Enter your second name: ");
    console.log(`Your complete name is: ${name} ${secondName}!`);
  } finally {
    rl.close();
  }
};

main();
