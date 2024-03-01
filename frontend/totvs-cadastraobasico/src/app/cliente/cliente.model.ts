import { Telefone } from "../telefone/telefone.model";

export interface Cliente {
    id: number;
    nome: string;
    endereco: string;
    bairro: string;
    telefones: Telefone[];
  }