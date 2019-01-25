function getDuplicates(array) {
  if (array.length <= 1) {
    console.log('No elements or only one element.');    
  }
  array.sort();
  const duplicates = new Map();
  let count = 1;
  for (let i = 1; i < array.length; i++) {
    if (array[i] === array[i-1]) {
      count++;
      duplicates.set(array[i], count);
    } else {
      count = 1; // reset it
    }
  }
  return Array.from(duplicates.keys());
}

function removeDuplicates(array) {
  if (array.length <= 1) {
    console.log('No elements or only one element.');    
  }
  finalArray = [];
  array.sort();
  for (let i = 1; i < array.length; i++) {
    if (array[i] !== finalArray[finalArray.length - 1]) {
      finalArray.push(array[i]);
    }
  }
  return finalArray;
}




const t = [1,1,2,4,5,8,7,9,6,4,1,8,7];

console.log(removeDuplicates(t));
