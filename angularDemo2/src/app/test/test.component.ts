import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  
  // <h2>hello mark</h2>
  // <h1> Hello {{firstName}} </h1>
  // <h1>{{10+20+30}}</h1>
  // <h1>{{'welcome ' + firstName}}</h1>
  // <h1>{{message.length}}</h1>
  // <button disabled >Button</button>
  // <button disabled="{{isDisabled}}" >Button-interpolation</button>
  // <button [disabled]="isDisabled" >Button-property binding</button>
  // <button (click)="onButtonClicked()">Click me</button>
  // <h1>{{text}}</h1>
  // <input type = "text" change = "onChange() "/>
  // `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  
  public text = 'Hello Guest';
  public dispaly = true;
  public isDisabled = false;

  public onButtonClicked() {
    console.log("button clicked");
    this.text = 'Hello Watson';
  }

  //public name: string = 'Paul';
  public firstName = 'Paul';
  public message = "this is a angular training";

  constructor() { }

  ngOnInit(): void {
  }
  onChange() {
    this.message = 'change happened';
  }

}
