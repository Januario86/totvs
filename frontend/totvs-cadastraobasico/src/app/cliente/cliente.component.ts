import { Component, OnInit } from '@angular/core';
import { ClienteService } from './cliente.service';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent implements OnInit{

  cliente: any = {}
  clientesCadastrados: any[] = [];

  constructor(private clienteService: ClienteService) {}
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  carregarClientes() {
    this.clienteService.getClientes().subscribe(
      (clientes) => {
        this.clientesCadastrados = clientes;
      },
      (error) => {
        console.error('Erro ao carregar clientes:', error);
      }
    );
  }

  adicionarCliente() {
    this.clienteService.adicionarCliente(this.cliente).subscribe(
      (novoCliente) => {
        this.clientesCadastrados.push(novoCliente);
        this.cliente = {}; 
      },
      (error) => {
        console.error('Erro ao adicionar cliente:', error);
      }
    );
  }

}
