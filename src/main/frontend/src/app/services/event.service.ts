import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EventRequest } from '../models/event-request.model';

@Injectable({
  providedIn: 'root',
})
export class EventService {
  private EVENTS_URL = 'http://localhost:8082/api/v1/events';

  constructor(private http: HttpClient) {}

  addEvent(eventRequest: EventRequest): Observable<any> {
    return this.http.post<any>(this.EVENTS_URL, eventRequest);
  }

  getAllEvents(): Observable<any>{
    return this.http.get<any>(this.EVENTS_URL);
  }
}
