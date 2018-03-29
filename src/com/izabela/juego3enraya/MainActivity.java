package com.izabela.juego3enraya;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {
	
	
	//----------------------------------------------------------------------------------------------------------------------------------------------
	// ATRIBUTOS
	//----------------------------------------------------------------------------------------------------------------------------------------------
	
	
	public Button btnSair, btnEmpezar;
	public TextView txt, label1, label2;
	
	
	
	//----------------------------------------------------------------------------------------------------------------------------------------------
	// CICLO DE VIDA DA ATIVIDADE
	//----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//criar layout da tela
		setContentView(R.layout.tela2activity);	
		

		btnSair = (Button)findViewById(R.id.salirDelJuego);
		Typeface font = Typeface.createFromAsset(getAssets(), "acmesa.TTF"); 
		btnSair.setTypeface(font);
		btnSair.setOnClickListener(Sair());
		
		btnEmpezar = (Button)findViewById(R.id.empezar);
		Typeface fontBoton = Typeface.createFromAsset(getAssets(), "acmesa.TTF"); 
		btnEmpezar.setTypeface(fontBoton);
		
		label1 = (TextView)findViewById(R.id.caixaLegendaNome1);
		Typeface fontlabel1 = Typeface.createFromAsset(getAssets(), "acmesa.TTF"); 
		label1.setTypeface(fontlabel1);
		
		label2 = (TextView)findViewById(R.id.caixaLegendaNome2);
		Typeface fontlabel2 = Typeface.createFromAsset(getAssets(), "acmesa.TTF"); 
		label2.setTypeface(fontlabel2);
		
	}
	//----------------------------------------------------------------------------------------------------------------------------------------------
	// METODOS DE CLIQUE
	//----------------------------------------------------------------------------------------------------------------------------------------------

	
	    public void click(View v){
	    	
	    	TextView nomePrimeiroJogador;
	    	TextView nomeSegundoJogador;
	    	
	    	nomePrimeiroJogador = (TextView)findViewById(R.id.nome_Jugador_1);
	    	nomeSegundoJogador = (TextView)findViewById(R.id.nome_Jugador_2);	    	
	    	
	    	Intent i1 = new Intent(this, AppTelas2.class);
            Bundle params1 = new Bundle();
            Bundle params2 = new Bundle();
                        
            params1.putString("n1", nomePrimeiroJogador.getText().toString());
            params2.putString("n2", nomeSegundoJogador.getText().toString());
            	                
            i1.putExtras(params1);
            i1.putExtras(params2);
            
            startActivity(i1);
	    }
	    
	    public View.OnClickListener Sair() {
			return new OnClickListener() {
				public void onClick(View v) {
					System.exit(0);
				}
			};
		}


		
}
