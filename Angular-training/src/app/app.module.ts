import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppComponent } from './app.component';

import { Test2ComponentComponent } from './test2-component/test2-component.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HeaderComponent } from './components/header/header.component';
import { MainContentComponent } from './components/main-content/main-content.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { FooterComponent } from './components/footer/footer.component';
import { Home2Component } from './home2/home2.component';
import { Navbar2Component } from './components2/navbar2/navbar2.component';
import { Header2Component } from './components2/header2/header2.component';
import { Sidebar2Component } from './components2/sidebar2/sidebar2.component';
import { TestComponent } from './test/test.component';


@NgModule({
  declarations: [
    AppComponent,
    
    Test2ComponentComponent,
    NavbarComponent,
    HeaderComponent,
    MainContentComponent,
    SidebarComponent,
    FooterComponent,
    Home2Component,
    Navbar2Component,
    Header2Component,
    Sidebar2Component,
    TestComponent
    
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
