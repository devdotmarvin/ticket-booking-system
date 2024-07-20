export interface EventRequest {
    eventName: string;
    eventDescription: string;
    startDate: Date;
    endDate: Date;
    location: string;
    base64EncodedImage: string;
  }