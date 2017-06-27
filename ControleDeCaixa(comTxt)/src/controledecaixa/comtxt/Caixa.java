/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledecaixa.comtxt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Emanuel
 */
public class Caixa {
    private double saldo;

    public String getSaldo() throws FileNotFoundException, IOException {
        FileReader a = new FileReader("src\\controledecaixa\\comtxt\\SimulaBD.txt");
        BufferedReader lerArq = new BufferedReader(a);
        String linha = lerArq.readLine();
        return linha;
    }
    
    public String entrarValor(double x) throws IOException{
        if(x == 0 || x < 0)
            return "Valor tem de ser maior que zero";
        else{
        FileReader a = new FileReader("src\\controledecaixa\\comtxt\\SimulaBD.txt");
        BufferedReader lerArq = new BufferedReader(a);
        String linha = lerArq.readLine();
        x += Double.valueOf(linha);
        FileWriter arq = new FileWriter("src\\controledecaixa\\comtxt\\SimulaBD.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(Double.toString(x));
        arq.close();
        return "Operacao Realizada com Sucesso";
        }
    }
    
    public String retirarValor(double x) throws FileNotFoundException, IOException{
        if(x == 0 || x < 0)
            return "Valor tem de ser maior que zero";
        else{
        FileReader a = new FileReader("src\\controledecaixa\\comtxt\\SimulaBD.txt");
        BufferedReader lerArq = new BufferedReader(a);
        String linha = lerArq.readLine();
        x = Double.valueOf(linha) - x;
            if(x < 0)
                return "Saldo Insuficiente";
            else{
        FileWriter arq = new FileWriter("src\\controledecaixa\\comtxt\\SimulaBD.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(Double.toString(x));
        arq.close();
        return "Operacao Realizada com Sucesso";
            }
        }
    }
    
    public void setSaldo(double x){
        saldo = x;
    }
}
