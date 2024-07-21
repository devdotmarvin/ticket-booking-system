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
  base64EncodedImage: string | null = null;

  constructor(private fb: FormBuilder) {
    this.eventForm = this.fb.group({
      eventName: ['', Validators.required],
      maxAttendees: ['', Validators.required],
      eventDescription: ['', Validators.required],
      startDate: ['', Validators.required],
      endDate: ['', Validators.required],
      location: ['', Validators.required],
      base64EncodedImage: ['', Validators.required]
    });
  }


  onSubmit() {
    if (this.eventForm.valid) {
      const eventRequest: EventRequest = {
        eventName: this.eventForm.value.eventName as string,
        maxAttendees: this.eventForm.value.maxAttendees as string,
        eventDescription: this.eventForm.value.eventDescription as string,
        startDate: this.eventForm.value.startDate as string,
        endDate: this.eventForm.value.endDate as string,
        location: this.eventForm.value.location as string,
        base64EncodedImage: this.base64EncodedImage as string
      }
      console.log('Submitted Form:', eventRequest);
      // Here you can send the eventRequest object to your backend service
    } else {
      this.eventForm.markAllAsTouched();
    }
  }

  resetForm(){
    this.eventForm.reset();
  }

  onFileSelected(event: any) {
    const file: File = event.target.files[0];
    if (file) {
      this.encodeFileBase64(file);
    }
  }

  encodeFileBase64(file: File) {
    const reader = new FileReader();
    reader.onload = () => {
      this.base64EncodedImage = reader.result as string;
      console.log(this.base64EncodedImage.split(',')[1]); // Log the Base64 content (optional)
    };
    reader.readAsDataURL(file);
  }

}
