function getPairs(array, sum) {
  response = [];
  for (let i = 0; i < array.length; i++) {
    for (let j = i + 1; j < array.length; j++) {
      if (array[i] + array[j] === sum) {
        response.push({
          one: array[i],
          two: array[j]
        });
      }
    }
  }
  return response;
}

const t = [1, 1, 2, 1.8, -8.9, 4, 5, 8, -3, 7, 9, 6, 4, 1, 8, 7, 928];

console.log(getPairs(t, 929));