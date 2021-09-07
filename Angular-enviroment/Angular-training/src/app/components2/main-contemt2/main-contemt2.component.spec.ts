import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MainContemt2Component } from './main-contemt2.component';

describe('MainContemt2Component', () => {
  let component: MainContemt2Component;
  let fixture: ComponentFixture<MainContemt2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MainContemt2Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MainContemt2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
