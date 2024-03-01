import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ClienteService {
  //private apiUrl = 'http://localhost:3000/clientes'
  private apiUrl = "http://localhost:8080/cliente"

  constructor(private http: HttpClient) {}
 
  getClientes(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }

  adicionarCliente(cliente: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, cliente);
  }
  
}
