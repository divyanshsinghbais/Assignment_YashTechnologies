var Item = /** @class */ (function () {
    function Item(_a) {
        var _b = _a === void 0 ? {} : _a, a = _b.a, b = _b.b, c = _b.c, d = _b.d;
        this.item_id = a;
        this.item_name = b;
        this.item_price = c;
        this.item_category = d;
    }
    return Item;
}());
var data = { "a": 101, "b": 'Car', "c": 550000, "d": 'Sports' };
var myObject = new Item(data);
console.log(myObject);
