import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test2',
  template: `
  <h1 class = "text-success">Heading1</h1>
  `,
  styles: [`
  .text-success{
    color: green
  }
  .text-danger{
    color:red
  }
  .text-special{
    font-style: italic
  }
  
  `]
})
export class Test2Component implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
