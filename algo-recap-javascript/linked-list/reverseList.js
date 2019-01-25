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

  printList() {
    let curr = this.head;
    do {
      console.log(curr.id);
      curr = curr.next;
    } while (curr)
  }

  reverse() {
    let prev = null;
    let curr = this.head;
    let next = curr.next;

    while (next) {
      const temp = next.next;
      next.next = curr;
      curr.next = prev;
      prev = curr;
      curr = next;
      next = temp;
    }
    this.head = curr;
    // console.log(this.head);
    return this;
  }
}

function generateList(list) {
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
  //  temp1.next = temp2;
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
generateList(list);

console.log(isCyclic(list) ? 'Bad list.' : 'Good list.');
list.printList();
const tempHead = list.reverse();
console.log('Reversed: ');
tempHead.printList();

