const readline = require('readline')
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
rl.question('Enter a number: ', (n) => {
    let result = 1;
    for (let i = 1; i <= n; i++) {
      result *= i;
    }
    console.log(`The factorial of ${n} is: ${result}`);
    rl.close();
  });