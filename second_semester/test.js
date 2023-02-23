function acharMinimoDeDias(duracoes) {
  // Write your code here

  // const duracoesN = duracoes.filter((ele) => {
  //   if(ele % 1 === 0) return ele;
  // });
  const duracoesFilm = duracoes.filter((ele) => {
    if(ele % 1 !== 0) return ele;
  });
  // return duracoesFilm;

  let days = 0;

  return duracoesFilm.reduce((acc, curr) => {
    if (acc + curr <= 3.00) {
      days += 1;
    }
    return days;
  })
 
}

console.log(acharMinimoDeDias([4, 1.01, 1.991, 1.32, 1.4]));

// let minusThree = 0;

// for (let i = 0; i <= filmes.length; i +=1) {

//   if (filmes[i] + filmes[i+1] <= 3.00) {
//     minusThree += 1;
//   }
//   for (let n = 0; n <= filmes.length; n +=1) {
//     if (filmes[i] + filmes[i+1] <= 3.00) {
//       minusThree += 1;
//     }
//   }
// }
// return minusThree/2;
  
      // console.log(filmes[i] + filmes[i + 1])
      // deu = filmes[i] + filmes[i + 1];
      // console.log(deu);

      // const filmes = duracoes.filter((ele) => ele !== ele[0]);
      // // return filmes;
      // let minusThree = 0;
      // let deu = 0;
      // let meh = [];
      // // 1.01, 1.01, 1.01, 1.4, 2.4
      // for (let i = 0; i <= filmes.length; i +=1) {
      //   if (filmes[i] + filmes[i] <= 3.00) {
      //     // console.log(filmes[i] + filmes[i + 1])
      //     // deu = filmes[i] + filmes[i + 1];
      //     // console.log(deu);
      //     minusThree += 1;
      //   }
      // }
      // // return minusThree;
      // return minusThree;
