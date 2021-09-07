import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent  {

  employees = [
    {code: 1, name: 'Mark', email: 'm@gmail.com', age: 30},
    {code: 2, name: 'Paul', email: 'p@gmail.com', age: 40},
    {code: 3, name: 'John', email: 'j@gmail.com', age: 45},
    {code: 4, name: 'Watson', email: 'w@gmail.com', age: 50},
  ]

  constructor() { }
  flag = true;
  onButtonClick() {
    if (this.flag) {
      this.flag = false;
    } else {
      this.flag = true; 
    }
  }

}
