import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angularDemo2';
  

  name = 'Mark smith';
message = 'welcome to angular training'
person = {
  firstName: 'Paul',
  lastName: 'Watson'
}
}

