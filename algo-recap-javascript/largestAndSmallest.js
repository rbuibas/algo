function getSmallesAndLargest(array) {
  let smallest = array[0];
  let largest = array[0];
  array.forEach(a => {
    if (a < smallest) {
      smallest = a;
    };
    if (a > largest) {
      largest = a;
    }
  });
  return {
    big: largest,
    small: smallest
  }
}

function getSaL(array) {
  return array.reduce((acc, cur) => {
    return {
      big: Math.max(acc.big, cur),
      small: Math.min(acc.small, cur)
    }
  }, {
    big: array[0],
    small: array[0]
  });
}

const t = [1,1,2,1.8,-8.9,4,5,8,-3,7,9,6,4,1,8,7, 928];

console.log(getSaL(t));
