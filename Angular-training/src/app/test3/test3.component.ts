// import { Component, OnInit } from '@angular/core';
import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test3',
  templateUrl: './test3.component.html',
  styleUrls: ['./test3.component.css']
})
export class Test3Component implements OnInit {

  @Input()
  childData =  '';

  @Output()
  childEvent = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }

  onButtonClick(){
    this.childEvent.emit('Hi from child component')
  }
}
