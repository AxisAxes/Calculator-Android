package com.calculadora;


import android.app.AlertDialog;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class TelaPrincipal extends Activity {

	private Button btnMais;
	private Button btnMenos;
	private Button btnDivisao;
	private Button btnMulti;
	private Button clear;
	private EditText n1;
	private EditText n2;
	private EditText result;

	private float valor1,valor2,resultado;


	
	
	
	public void confirm(){
		AlertDialog.Builder alert = new AlertDialog.Builder(TelaPrincipal.this);
		alert.setTitle("Erro!");
		alert.setMessage("Não existe divisão por 0! Troque o valor 2 e tente novamente.");
		alert.setPositiveButton("OK", null);
		alert.show();
	}

	
	
	public void LimpaCampos(){
		n1.setText("");
		n2.setText("");
		result.setText("");
		n1.requestFocus();
		
	}
	
	public void Mais(){
		
		try {
			valor1 = Float.parseFloat(n1.getText().toString());
			valor2 = Float.parseFloat(n2.getText().toString());
			resultado = (valor1 + valor2);
			result.setText(Float.toString(resultado));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Toast.makeText(TelaPrincipal.this, "Impossivel Somar coisas inexistentes !", Toast.LENGTH_SHORT).show();

		}
		
	}
	
	public void Menos(){
		
		try {
			valor1 = Float.parseFloat(n1.getText().toString());
			valor2 = Float.parseFloat(n2.getText().toString());
			resultado = (valor1 - valor2);
			result.setText(Float.toString(resultado));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Toast.makeText(TelaPrincipal.this, "Impossivel Subtrair coisas inexistentes !", Toast.LENGTH_SHORT).show();

		}
		
		
	}
	
	public void Dividir(){
		
		try {
			valor1 = Float.parseFloat(n1.getText().toString());
			valor2 = Float.parseFloat(n2.getText().toString());
			resultado = (valor1 / valor2);
			if(valor2 == 0)
				confirm();
			else
				result.setText(Float.toString(resultado));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Toast.makeText(TelaPrincipal.this, "Impossivel Dividir coisas inexistentes !", Toast.LENGTH_SHORT).show();

		}
	}
	
	public void Multiplicar(){
		
		try {
			valor1 = Float.parseFloat(n1.getText().toString());
			valor2 = Float.parseFloat(n2.getText().toString());
			resultado = (valor1 * valor2);
			result.setText(Float.toString(resultado));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Toast.makeText(TelaPrincipal.this, "Impossivel Multiplicar coisas inexistentes !", Toast.LENGTH_SHORT).show();

		}
		
	}
	


	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);
        
        
    	btnMais = (Button)findViewById(R.id.btnMais);
    	btnMenos = (Button)findViewById(R.id.btnMenos);
    	btnDivisao = (Button)findViewById(R.id.btnDiv);
    	btnMulti = (Button)findViewById(R.id.btnMult);
    	btnMais = (Button)findViewById(R.id.btnMais);
    	clear = (Button)findViewById(R.id.btnClear);
    	n1 = (EditText)findViewById(R.id.editN1);
    	n2 = (EditText)findViewById(R.id.editN2);
    	result = (EditText)findViewById(R.id.editResult); 
    	
    	 try {
			clear.setOnClickListener(new View.OnClickListener(){
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					LimpaCampos();
				}
			});
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    
    
    	 try {
			btnMais.setOnClickListener(new View.OnClickListener(){
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Mais();
				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
    
    
    	 try {
			btnMenos.setOnClickListener(new View.OnClickListener(){
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Menos();
				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
    
      	 try {
			btnDivisao.setOnClickListener(new View.OnClickListener(){
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Dividir();
					}
				});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      	 
      	 
      	 try {
			btnMulti.setOnClickListener(new View.OnClickListener(){
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Multiplicar();
				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }

 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela_principal, menu);
        
        
        return true;
    }



	public Button getBtnMenos() {
		return btnMenos;
	}



	public void setBtnMenos(Button btnMenos) {
		this.btnMenos = btnMenos;
	}



	public Button getBtnMais() {
		return btnMais;
	}



	public void setBtnMais(Button btnMais) {
		this.btnMais = btnMais;
	}



	public Button getBtnDivisao() {
		return btnDivisao;
	}



	public void setBtnDivisao(Button btnDivisao) {
		this.btnDivisao = btnDivisao;
	}



	public Button getBtnMulti() {
		return btnMulti;
	}



	public void setBtnMulti(Button btnMulti) {
		this.btnMulti = btnMulti;
	}



	public EditText getN1() {
		return n1;
	}



	public void setN1(EditText n1) {
		this.n1 = n1;
	}



	public Button getClear() {
		return clear;
	}



	public void setClear(Button clear) {
		this.clear = clear;
	}



	public EditText getN2() {
		return n2;
	}



	public void setN2(EditText n2) {
		this.n2 = n2;
	}



	public EditText getResult() {
		return result;
	}



	public void setResult(EditText result) {
		this.result = result;
	}


    
}
