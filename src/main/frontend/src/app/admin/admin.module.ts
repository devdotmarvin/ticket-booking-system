import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TicketComponent } from './pages/master/ticket/ticket.component';
import { ReactiveFormsModule } from '@angular/forms';
import { EventComponent } from './pages/master/event/event.component';



@NgModule({
  declarations: [
   EventComponent,
    TicketComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule
  ]
})
export class AdminModule { }
