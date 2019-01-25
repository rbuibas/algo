const arraySorted = [1,2,3,4,6,7,8,9];
const arrayUnsorted = [1,7,4,6,9,2,8,3];
// const arrayUnsortedWithDuplicates = [1,7,4,6,9,2,8,3,1,3,4];
// const arrayUnsortedWithDuplicates = [1,7,4,6,6,6,6,9,2,8,3,1,3,4];
const arrayUnsortedWithDuplicates = [];

function findMissingNumber(from, to, array) {
  
  const matSum = (to) * (from + to) / 2;
  const actSum = arrayUnsorted.reduce((acc, cur) => acc + cur);
  return matSum - actSum;
}

console.log(findMissingNumber(1, arrayUnsorted.length + 1, arrayUnsorted));

function findMissingNumberExtended(array) {
  // array may contain duplicates, will need to sort it
  array.sort();
  for (let i = 1; i < array.length; i++) {
    if (array[i] - array[i-1] > 1) {
      return array[i] - 1;
    }
  }
}

console.log(findMissingNumberExtended(arrayUnsortedWithDuplicates));