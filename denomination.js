console.log("bharu");
function calculateDenomination() {
    let amount = 163;
    const denominations = [100, 50, 20, 10, 5, 2, 1];
    let result = "";
    for (let i = 0; i < denominations.length; i++) {
      const denomination = denominations[i];
      const count = Math.floor(amount / denomination);
      if (count > 0) {
        result += `${count} ${denomination}'s\n`;
        amount -= denomination * count;
      }
    }
    return result;
  }
  const output = calculateDenomination();
  console.log(`Bank denomination: ${output}`);
  