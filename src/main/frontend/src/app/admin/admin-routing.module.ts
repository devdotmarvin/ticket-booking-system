import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EventsComponent } from './pages/events/events.component';
import { TicketsComponent } from './pages/tickets/tickets.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'events',
    pathMatch: 'full',
  },
  {
    path: 'events',
    component: EventsComponent,
  },
  {
    path: 'tickets',
    component: TicketsComponent,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AdminRoutingModule {}
