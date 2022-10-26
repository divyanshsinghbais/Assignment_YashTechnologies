class Item {
  item_id: number;
  item_name: string;
  item_price: number;
  item_category: string;
  constructor({ a,b,c,d }: { a?: number, b?: string, c?: number , d?: string} = {}) {
    this.item_id = a;
    this.item_name = b;
    this.item_price = c;
	this.item_category = d;
  }
}

let data = { "a": 101, "b": 'Car', "c": 550000 , "d":'Sports'};
let myObject = new Item(data);
console.log(myObject);