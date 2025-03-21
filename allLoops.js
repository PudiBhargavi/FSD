function allLoops(n){
    console.log("Using for loop");
    for(let i=1;i<1;i++)
        console.log(i);
    console.log("Using while loop");
    var j=1;
    while(j<n){
        console.log(j);
        j++;
    }
    console.log("Using do-while loop");
    var k=1;
    do{
        console.log(k);
        k++;
    }
    while(k<n);
}
let n=101;
allLoops(n);