package com.example.kira.myapplication7;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
TextView tx;
Button one;
Button two;
Button three;
Button four;
Button five;
Button six;
Button seven;
Button eight;
Button nine;
Button zero;
Button dot;
Button clear;
Button delet;
Button mult;
Button trh;
Button div;
Button mode;
Button add;
    Button kos;
boolean stat=false;
Button   equal;
    int kara=0;
    int om=1;
    int legend=0;
    int a=0;
    String temp;
    double result=0;
    int ko=0;
    int z=0;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mf=getMenuInflater();
        mf.inflate(R.menu.mymenue,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.advance){
            final    Intent trans=new Intent(this,Main2Activity.class);
            startActivity(trans);
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       kos = (Button) findViewById(R.id.kos);
        tx = (TextView) findViewById(R.id.txt0);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        dot = (Button) findViewById(R.id.dot);
        clear = (Button) findViewById(R.id.Clear);
        delet = (Button) findViewById(R.id.delet);
        mult = (Button) findViewById(R.id.mult);
        trh = (Button) findViewById(R.id.trh);
        div = (Button) findViewById(R.id.div);
        add = (Button) findViewById(R.id.add);
        mode = (Button) findViewById(R.id.mode);
         equal=(Button)findViewById(R.id.equal);
       //  mod=(Button)findViewById(R.id.mod);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                two();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                three();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                five();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                six();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seven();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eight();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nine();
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zero();
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });
        delet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delet();
            }
        });
       add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               operation('+');
            }
        });
        trh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               operation('-');
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation('x');
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation('÷');
            }
        });
      mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation('%');
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equal();
                stat=true;
            }
        });
        kos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a==0){
                    String u=tx.getText().toString();
                    if(!("".equals(u))&&!(u.endsWith("+")||u.endsWith("-")||u.endsWith("x")||u.endsWith("÷")||u.endsWith("%")))
                        op("x(");
                    else
                        op("(");
                    a=1;
                    legend=1;
                }
                else {
                    op(")");
                    a=0;
                    legend=0;
                }
            }
        });
    }
    protected void one(){
        stat();
        String x=tx.getText()+one.getText().toString();
        if(om==1) {

            om = 1;
            tx.setText(x);
        }

    }
    protected void two(){
        stat();
        String x=tx.getText()+two.getText().toString();
        if(om==1) {
            om = 1;
            tx.setText(x);
        }
    }
    protected void three(){
        stat();
        String x=tx.getText()+three.getText().toString();
        if(om==1) {

            om = 1;
            tx.setText(x);
        }
    }
    protected void four(){
        stat();
        String x=tx.getText()+four.getText().toString();
        if(om==1) {

            om = 1;
            tx.setText(x);
        }
    }
    protected void five(){
        stat();
        String x=tx.getText()+five.getText().toString();
        if(om==1) {

            om = 1;
            tx.setText(x);
        }
    }
    protected void six(){
        stat();
        String x=tx.getText()+six.getText().toString();
        if(om==1) {

            om = 1;
            tx.setText(x);
        }
    }
    protected void seven(){
        stat();
        String x=tx.getText()+seven.getText().toString();
        if(om==1) {
            one();
            om = 1;
            tx.setText(x);
        }
    }
    protected void eight(){
        stat();
        String x=tx.getText()+eight.getText().toString();
        if(om==1) {

            om = 1;
            tx.setText(x);
        }
    }
    protected void nine(){
        stat();
        String x=tx.getText()+nine.getText().toString();
        if(om==1) {

            om = 1;
            tx.setText(x);
        }
    }
    protected void zero(){
        stat();
        String x=tx.getText()+zero.getText().toString();
        if(om==1) {

            om = 1;
            tx.setText(x);
        }
    }
    protected void dot(){
        stat();
        String x=tx.getText()+dot.getText().toString();
        if(om==1) {

            om = 1;
            tx.setText(x);
        }
    }
    protected void clear(){
        tx.setText("");
        tx.setTextSize(60);
        om=1;
        a=0;
        legend=0;
    }
    protected void delet() {
        try {
            String x = tx.getText().toString();
            if(x.endsWith("+")||x.endsWith("-")||x.endsWith("x")||x.endsWith("÷")||x.endsWith("%"))
                legend=1;
                x = x.substring(0, x.length() - 1);
            tx.setText(x);
            om=1;
        }catch (Exception e ){
            Toast.makeText(this, "Is Empty", Toast.LENGTH_SHORT).show();
        }
    }
    protected void operation(char y){
        stat=false;
        String u= tx.getText().toString();
        if(u.endsWith("+")||u.endsWith("-")||u.endsWith("x")||u.endsWith("÷")||u.endsWith("%")) {
            u=u.substring(0,u.length()-1)+y;
           // u=u.replace(u.charAt(u.length()-1)+"",y+"");
        tx.setText(u);
        }
        else if(tx.getText().equals("")){
            tx.setText(y+"");
kara=0;
u="";
        }
        else if((kara==0)||!(u.contains("+")||u.contains("-")||u.contains("x")||u.contains("÷")||u.contains("%"))){
            u= tx.getText().toString()+ y;
            tx.setText(u);
            kara=1;
            legend=0;
        }
        else if((u.contains("+")||u.contains("-")||u.contains("x")||u.contains("÷")||u.contains("%"))){
            if(legend==0)
            equal();
            stat=false;
            u= tx.getText().toString()+ y;
            tx.setText(u);
            kara=1;
legend=0;
        }
    }
    protected void op(String x){
        stat();
        String str =tx.getText().toString()+x;
        if(om==1) {
            om = 1;
            tx.setText(str);
        }
    }
    protected void helpequal(){
        int L = temp.indexOf('(');
        int R = temp.indexOf(')');
        String temp3 = temp.substring(L, R + 1);
        double a ;
        double b;
        result=0;
        for(int x=1;x<temp3.length();x++){
            if(temp3.charAt(L+1)=='-')
                continue;;
                 L = temp3.indexOf('(');
                  R = temp3.indexOf(')');
            if      (temp3.charAt(x)=='+'){
                a = Double.parseDouble(temp3.substring(L+1, x));
                b = Double.parseDouble(temp3.substring(x+1, R));
                result =a+b;
            }
            else    if(temp3.charAt(x)=='-'){
                a = Double.parseDouble(temp3.substring(L+1, x));
                b = Double.parseDouble(temp3.substring(x+1, R));
                result =a-b;
            }
            else      if(temp3.charAt(x)=='x'){
                a = Double.parseDouble(temp3.substring(L+1, x));
                b = Double.parseDouble(temp3.substring(x+1, R));
                result =a*b;
            }
             else      if(temp3.charAt(x)=='%'){
                                a = Double.parseDouble(temp3.substring(L+1, x));
                                     b = Double.parseDouble(temp3.substring(x+1, R));
                                        result =a%b;

            }
            else       if(temp3.charAt(x)=='÷'){
                a = Double.parseDouble(temp3.substring(L+1, x));
                b = Double.parseDouble(temp3.substring(x+1, R));
                if(b==0)                    {
                    Toast.makeText(this, "can't divide by zero", Toast.LENGTH_LONG).show();
                                     z=1;
                }
                else
                    result =a/b;
            }
        }
        temp = temp.replace(temp3, result + "");
    }
    protected void equal() {
        try {
             temp = tx.getText().toString();
                 double a;
                 double b;
                 for (int i = 1; i < temp.length(); i++) {
                     if (temp.contains(")")) {
                         int L = temp.indexOf('(');
                         int R = temp.indexOf(')');
                         String temp1 = temp.substring(L + 1, R);
                         String temp3 = temp.substring(L, R + 1);
                         if (temp1.contains("+") || temp1.contains("-") || temp1.contains("x") || temp1.contains("÷")|| temp1.contains("%")) {
                             helpequal();
                         } else {
                             temp = temp.replace(temp3, temp1);
                             tx.setText(temp);
                         }
                     } else if (temp.contains("(")) {
                         legend = 0;
                         int L = temp.indexOf('(');
                         for (int x = 1; x < temp.length(); x++) {
                             if (x < L) continue;
                             if (temp.charAt(x) == '+') {
                                 a = Double.parseDouble(temp.substring(L + 1, x));
                                 b = Double.parseDouble(temp.substring(x + 1, temp.length()));
                                 result = a + b;
                             } else if (temp.charAt(x) == '-') {
                                 a = Double.parseDouble(temp.substring(L + 1, x));
                                 b = Double.parseDouble(temp.substring(x + 1, temp.length()));
                                 result = a - b;
                             } else if (temp.charAt(x) == 'x') {
                                 a = Double.parseDouble(temp.substring(L + 1, x));
                                 b = Double.parseDouble(temp.substring(x + 1, temp.length()));
                                 result = a * b;
                             } else if (temp.charAt(x) == '÷') {
                                 a = Double.parseDouble(temp.substring(L + 1, x));
                                 b = Double.parseDouble(temp.substring(x + 1, temp.length()));
                                 if (b == 0)     {
                                     Toast.makeText(this, "can't divide by zero", Toast.LENGTH_LONG).show();
                                         z=1;
                                 }
                                 else
                                     result = a / b;
                             }
                         }
                         String temp1 = temp.substring(L + 1, temp.length());
                         String h = result + "";
                         if (h.endsWith(".0"))
                             temp = temp.replace(temp1, (int) result + "");
                         else
                             temp = temp.replace(temp1, result + "");
                         ko = 1;
                     }
                     if (ko != 1) {
                         if (temp.charAt(i) == '+') {
                             a = Double.parseDouble(temp.substring(0, i));
                             b = Double.parseDouble(temp.substring(i + 1, temp.length()));
                             result = a + b;
                         } else if (temp.charAt(i) == '-') {
                             a = Double.parseDouble(temp.substring(0, i));
                             b = Double.parseDouble(temp.substring(i + 1, temp.length()));
                             result = a - b;
                         } else if (temp.charAt(i) == 'x') {
                             a = Double.parseDouble(temp.substring(0, i));
                             b = Double.parseDouble(temp.substring(i + 1, temp.length()));
                             result = a * b;
                         } else if (temp.charAt(i) == '÷') {
                             a = Double.parseDouble(temp.substring(0, i));
                             b = Double.parseDouble(temp.substring(i + 1, temp.length()));
                             if (b == 0) {
                                 z=1;
                                 Toast.makeText(this, "can't divide by zero", Toast.LENGTH_LONG).show();
                             }
                             else
                                 result = a / b;
                         } else if (temp.charAt(i) == '%') {
                             a = Double.parseDouble(temp.substring(0, i));
                             b = Double.parseDouble(temp.substring(i + 1, temp.length()));
                             result = a % b;
                         }
                     }
                 }
                 String h = result + "";
                 if (h.length() > 9)
                     tx.setTextSize(30);
                 if (h.endsWith(".0"))
                     tx.setText(String.format("%.0f", result));
                 else
                     tx.setText(result + "");
                      if(z==1) {
                        tx.setText("invalid operation");
                      }
                 if(ko==1) {
                     tx.setText(temp + "");
                 }
  ko=0;
                      z=0  ;
stat=true;
kara=0;
legend=0;
        } catch (Exception e) {
         //   Toast.makeText(this, temp, Toast.LENGTH_LONG).show();
        }
    }
  protected void stat(){
      if(stat){
          clear();
      stat=false;
      kara=0;}
      String f=tx.getText().toString();
      if(f.length()>=9&&f.length()<19)
          tx.setTextSize(30);
      else if(tx.getText().length()>=19) {
          Toast.makeText(this, "Is Empty", Toast.LENGTH_LONG).show();
         om=0;
      }

  }

}
