import { Component } from '@angular/core';

@Component({
  selector: 'app-ciao-bello',
  templateUrl: './ciao-bello.component.html',
  styleUrls: ['./ciao-bello.component.css']
})
export class CiaoBelloComponent {


  name: string = "Antonio";
  Saluta(): void {
    alert("Ciao " + this.name)
  }
}
