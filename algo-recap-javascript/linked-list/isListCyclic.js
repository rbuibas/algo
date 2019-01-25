class LList {
  constructor(id) {
    this.head = {
      id,
      next: null
    }
  }

  addFront(node) {
    node.next = this.head;
    this.head = node;
    return this.head;
  }
}

function isCyclic(lList) {
  fast = slow = lList.head;
  while (fast.next && fast.next.next) {
    fast = fast.next.next;
    slow = slow.next;
    if (fast === slow) {
      return true;
    }
  }
  return false;
}

list = new LList('A');
list.addFront({
  id: 'B'
});
temp1 = list.addFront({
  id: 'C'
});
list.addFront({
  id: 'D'
});
temp2 = list.addFront({
  id: 'E'
});
list.addFront({
  id: 'F'
});
temp1.next = temp2;
console.log(isCyclic(list) ? 'Bad list.' : 'Good list.');

