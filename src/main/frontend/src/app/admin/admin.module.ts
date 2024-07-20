import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { EventsComponent } from './pages/events/events.component';
import { ReactiveFormsModule } from '@angular/forms';
import { NavbarComponent } from './components/navbar/navbar.component';
import { RouterModule } from '@angular/router';
import { TicketsComponent } from './pages/tickets/tickets.component';


@NgModule({
  declarations: [
    EventsComponent,
    TicketsComponent,
    NavbarComponent,
  ],
  imports: [
    CommonModule,
    AdminRoutingModule,
    ReactiveFormsModule,
    RouterModule
  ]
})
export class AdminModule { }
