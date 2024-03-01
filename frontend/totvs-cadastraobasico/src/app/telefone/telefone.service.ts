import { Injectable } from '@angular/core';
import { Telefone } from './telefone.model';

@Injectable({
  providedIn: 'root',
})
export class TelefoneService {
  private telefones: Telefone[] = [];

  
}