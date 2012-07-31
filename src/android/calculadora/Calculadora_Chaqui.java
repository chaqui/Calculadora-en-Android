package android.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Calculadora_Chaqui extends Activity implements OnClickListener  {
	
	boolean suma;
    boolean resta;
    boolean multiplicacion;
    boolean division;
    boolean bandera;
    boolean otro;
    float total=0;
    @Override
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora__chaqui);
        //----Conexion con las vistas-----
        //Boton 0---
        View Boton0=findViewById(R.id.Bt0);
        //Boton 1---
        View Boton01=findViewById(R.id.BtUno);
        //Boton 2---
        View Boton02=findViewById(R.id.Bt2);
        //Boton 3---
        View Boton03=findViewById(R.id.Bt03);
        //Boton 4---
        View Boton04=findViewById(R.id.Bt4);
        //Boton 5---
        View Boton05=findViewById(R.id.Bt5);
        //Boton 6---
        View Boton06=findViewById(R.id.Bt6);
        //Boton 7---
        View Boton07=findViewById(R.id.Bt7);
        //Boton 8---
        View Boton08=findViewById(R.id.Bt8);
        //Boton 9---
        View Boton09=findViewById(R.id.Bt9);
        //Boton +---
        View BotonMas=findViewById(R.id.IdMas);
        //Boton ----
        View BotonMenos=findViewById(R.id.BtMenis);
        //Boton *---
        View BotonPor=findViewById(R.id.BtPor);
        //Boton /---
        View BotonDivision=findViewById(R.id.BtDivision);
        //Conexiones con los botones
        Boton0.setOnClickListener(this);
        Boton01.setOnClickListener(this);
        Boton02.setOnClickListener(this);
        Boton03.setOnClickListener(this);
        Boton04.setOnClickListener(this);
        Boton05.setOnClickListener(this);
        Boton06.setOnClickListener(this);
        Boton07.setOnClickListener(this);
        Boton08.setOnClickListener(this);
        Boton09.setOnClickListener(this);
        BotonMas.setOnClickListener(this);
        BotonMenos.setOnClickListener(this);
        BotonPor.setOnClickListener(this);
        BotonDivision.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_calculadora__chaqui, menu);
        return true;
    }
    public void cargarnumero(String numero1)
    {
    	TextView numero = (TextView)findViewById(R.id.txtViewNumero);
		String num;
    	if(bandera)
		{
			numero.setText(String.valueOf(numero1) );
		}
		else
		{
			num=String.valueOf(numero.getText());
			num.concat(numero1);
			numero.setText(String.valueOf(num));
		}
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		TextView numero = (TextView)findViewById(R.id.txtViewNumero);
		
		if(v.getId()==findViewById(R.id.Bt0).getId()){
			cargarnumero("0");
			numero.setText("0");
		}
		else
		{
			if(v.getId()==findViewById(R.id.BtUno).getId()){
				cargarnumero("1");
			}	
			else
			{
				if(v.getId()==findViewById(R.id.Bt2).getId()){
					cargarnumero("2");
				}	
				else
				{
					if(v.getId()==findViewById(R.id.Bt03).getId()){
						cargarnumero("3");
					}	
					else
					{
						if(v.getId()==findViewById(R.id.Bt4).getId()){
							cargarnumero("4");
						}
						else
						{
							if(v.getId()==findViewById(R.id.Bt5).getId()){
								cargarnumero("5");
							}	
							else
							{
								if(v.getId()==findViewById(R.id.Bt6).getId()){
									cargarnumero("6");
								}	
								else
								{
									if(v.getId()==findViewById(R.id.Bt7).getId()){
										cargarnumero("7");
									}
									else
									{
										if(v.getId()==findViewById(R.id.Bt8).getId()){
											cargarnumero("8");
										}	
										else
										{
											if(v.getId()==findViewById(R.id.Bt9).getId()){
												cargarnumero("9");
											}
											else
											{
												if(v.getId()==findViewById(R.id.Bt0).getId()){
													cargarnumero("0");
												}	
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
	public float operacion(float num)
	{
		
		if (suma)
		{
			total= total+num;
		}
		else
		{
			if(resta)
			{
				total=total-num;
			}
			else
			{
				if(multiplicacion)
				{
					total=total*num;
				}
				else
				{
					if(division)
					{
						total=total/num;
					}
					else
					{
						total=num;
					}
				}
			}
		}
		return total;
	}
    
}
