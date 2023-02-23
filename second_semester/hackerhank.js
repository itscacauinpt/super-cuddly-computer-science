function simpleArraySum(ar) {
  // Write your code here
  let sum = 0;
  for (let i = 0; i < ar.length; i +=1) {
    //->> index = 0 ~ index = 3 -->> ar.length = 4 -- index four doesnt exist
    sum += ar[i]
  }
  return sum;

  // const reduceAr = ar.reduce((acc, curr) => {
  //   return acc + curr;
  // }, 0);
  // return reduceAr;

}
// console.log(simpleArraySum([1, 2, 3, 4, 10, 11]))

const a = [17, 28, 30];
const b = [99, 16, 8];

let score = [0, 0];
  
for (let i = 0; i < a.length; i +=1) {
  if (a[i] > b[i]) {
    score[0] +=1;
  } else if (a[i] < b[i]) {
    score[1]+=1;
  } else {
    score;
  }
  // console.log(score)
}
