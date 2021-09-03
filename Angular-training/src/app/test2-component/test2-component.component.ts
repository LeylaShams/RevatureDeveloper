import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test2-component',
  templateUrl: './test2-component.component.html',
  styleUrls: ['./test2-component.component.css']
})
export class Test2ComponentComponent  {
  name = "Mark Smith"
  person = {
    firstName: "Leyla",
    lastName: "Shams"

  }

  constructor() { }

 

}
