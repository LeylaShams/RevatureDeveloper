import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employee-detail',
  templateUrl: './employee-detail.component.html',
  styleUrls: ['./employee-detail.component.css'],
  providers: [DataService]
})
export class EmployeeDetailComponent implements OnInit {

  employees: any[] = [];
  constructor(private dataService: DataService) {
    // let dataService = new DataService();
    this.employees =  dataService.getEmployees()
   }

  ngOnInit(): void {
  }

}
