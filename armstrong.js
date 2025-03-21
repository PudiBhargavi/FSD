function isArmStrong(n)
{
    let n1 = n;
    let sum = 0;
    while(n1!=0){
        let x = n1%10;
        sum = sum+Math.pow(x,3);
        n1 = Math.floor(n1/10);
    }
    return (n == sum);
}
let n=371
if(isArmStrong(n))
    console.log("Arm Strong");
else
    console.log("Not Arm Strong");