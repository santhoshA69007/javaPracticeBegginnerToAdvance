void main(){
Store store=new Store();
store.addProduct(new Phone(999,"electronics","6inch iphone 15pro",6,5000));
store.addProduct(new Charger(9.99,"electronics","charger for iphone 15pro",1.5,true));


store.getBill();

}
