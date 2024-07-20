import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { EventRequest } from 'src/app/models/event-request.model';

@Component({
  selector: 'app-events',
  templateUrl: './events.component.html',
  styleUrls: ['./events.component.css']
})
export class EventsComponent {
  eventForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.eventForm = this.fb.group({
      eventName: ['', Validators.required],
      maxAttended: ['', Validators.required],
      eventDescription: ['', Validators.required],
      startDate: ['', Validators.required],
      endDate: ['', Validators.required],
      location: ['', Validators.required],
      base64EncodedImage: ['', Validators.required]
    });
  }

  onSubmit() {
    if (this.eventForm.valid) {
      const eventRequest: EventRequest = this.eventForm.value;
      console.log('Submitted Form:', eventRequest);
      // Here you can send the eventRequest object to your backend service
    } else {
      this.eventForm.markAllAsTouched();
      // Optionally, handle form validation errors
    }
  }

}
