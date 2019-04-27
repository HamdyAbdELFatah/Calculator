package com.example.kira.myapplication7;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class Main2Activity extends AppCompatActivity {
    Button mod;
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
    Button   equal;
    boolean stat=false;
    Button sin;
    Button cos;
    Button tan;
    Button log;
    Button sqrt;
    Button fact;
    Button kos;
    char op;
    char ch;
    int a=0;
    Button mult;
    Button trh;
    Button div;
    Button add;
    int kara=0;
    int om=1;
    int ko=0;
    int z=0;
    int legend=0;
    double result=0 ;
    String temp;
    String temp3;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mf=getMenuInflater();
        mf.inflate(R.menu.mymenu2,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.normal){
            finish();
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        tan = (Button) findViewById(R.id.tan);
        log = (Button) findViewById(R.id.log);
        fact = (Button) findViewById(R.id.fact);
        sqrt = (Button) findViewById(R.id.sqrt);
        kos = (Button) findViewById(R.id.kos);
        equal=(Button)findViewById(R.id.equal);
        mult = (Button) findViewById(R.id.mult);
        trh = (Button) findViewById(R.id.trh);
        div = (Button) findViewById(R.id.div);
        add = (Button) findViewById(R.id.add);
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
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equal();
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op("sin(");a=1;op='s';
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op("cos(");a=1;op='c';
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op("tan(");a=1;op='t';
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op("log(");a=1;op='l';
            }
        });
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op("fact(");a=1;op='f';
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op("√(");a=1;op='q';
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
                    legend=1;
                a=1;}
                else {
                    op(")");
                    a=0;
                    legend=0;
                }
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
        ko=0;
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
    protected void stat(){
        if(stat){
            clear();
            stat=false;
            kara=0;}
        String f=tx.getText().toString();
        if(f.length()>=9&&f.length()<19)
            tx.setTextSize(30);
        else if(tx.getText().length()>=19) {
            Toast.makeText(this, "Is Empty", Toast.LENGTH_SHORT).show();
            om=0;
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
    protected int fact(int x){
        int result=1;
        for(int i=x;i>1;i--){
            result*=i;
        }
        return result;
    }
    protected double sin(double x){
        double result=Math.sin(Math.toRadians(x));
        return result;
    }
    protected double cos(double x){
        double result=Math.cos(Math.toRadians(x));
        return result;
    }
    protected double tan(double x){
        double result=Math.tan(Math.toRadians(x));
        return result;
    }
    protected double log(double x){
        double result=Math.log(x);
        return result;
    }
    protected double sqrt(double x){
        double result=Math.sqrt(x);
        return result;
    }
    protected void operation(char y){
        stat=false;
        if(om==1) {
            om = 1;
            String u = tx.getText().toString();
            if(u.endsWith("+")||u.endsWith("-")||u.endsWith("x")||u.endsWith("÷")||u.endsWith("%")) {
                u=u.substring(0,u.length()-1)+y;
                tx.setText(u);
            }
            else if(tx.getText().equals("")){
                tx.setText(y + "");
                kara = 0;
                u = "";
            } else if ((kara == 0) || !(u.contains("+") || u.contains("-") || u.contains("x") || u.contains("÷"))) {
                u = tx.getText().toString() + y;
                tx.setText(u);
                kara = 1;
                legend=0;
            }  else if ((u.contains("+") || u.contains("-") || u.contains("x") || u.contains("÷"))) {
                if(legend==0)
                    equal();
                stat = false;
                u = tx.getText().toString() + y;
                tx.setText(u);
                kara = 1;
                ko=0;
                legend=0;
            }
        }
    }
    protected void helpequal(){
        int L = temp3.indexOf('(');
        int R = temp3.indexOf(')');
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
            int R=0;
             temp = tx.getText().toString();
            for(int i=0;i<temp.length();i++) {
            if (temp.contains(")")) {
              int L = temp.indexOf('(');
                R = temp.indexOf(')');
                String temp1 = temp.substring(L + 1, R);
                 temp3 = temp.substring(L , R+1);
               if(temp1.contains("+")||temp1.contains("-")||temp1.contains("x")||temp1.contains("÷")) {
                   helpequal();
               }else{
                   result= Double.parseDouble(temp1);
                   tx.setText(temp);
                   }
                  R = temp.indexOf(')');
                    if (temp.charAt(i) =='i') {
                        result = sin(result);
                        String temp2 = temp.substring(i - 1, R+1 );
                        String h = result + "";
                        if (h.endsWith(".0"))
                            temp = temp.replace(temp2, (int) result + "");
                        else
                            temp = temp.replace(temp2, result + "");
                    } else if (temp.charAt(i)  == 'o') {
                        result = cos(result);
                        String temp2 = temp.substring(i-1 , R+1 );
                        String h = result + "";
                        if (h.endsWith(".0"))
                            temp = temp.replace(temp2, (int) result + "");
                        else
                            temp = temp.replace(temp2, result + "");
                    } else if (temp.charAt(i)  == 'f') {
                        result = fact((int) result);
                        String temp2 = temp.substring(i, R+1 );
                        String h = result + "";
                        if (h.endsWith(".0"))
                            temp = temp.replace(temp2, (int) result + "");
                        else
                            temp = temp.replace(temp2, result + "");
                    } else if (temp.charAt(i)  == 'n') {
                        result = tan(result);
                        String temp2 = temp.substring(i - 2, R+1) ;
                        String h = result + "";
                        if (h.endsWith(".0"))
                            temp = temp.replace(temp2, (int) result + "");
                        else
                            temp = temp.replace(temp2, result + "");
                    } else if (temp.charAt(i)  == '√') {
                        result = sqrt(result);
                        String temp2 = temp.substring(i , R +1);
                        String h = result + "";
                        if (h.endsWith(".0"))
                            temp = temp.replace(temp2, (int) result + "");
                        else
                            temp = temp.replace(temp2, result + "");
                    } else if (temp.charAt(i)  == 'l') {
                        result = log(result);
                        String temp2 = temp.substring(i , R +1);
                        temp = temp.replace(temp2, result +"");
                    }
                    else if (temp.charAt(i)  == '(') {
                        result = Double.parseDouble(temp1);
                        String temp2 = temp.substring(i , R +1);
                        String h = result + "";
                        if (h.endsWith(".0"))
                            temp = temp.replace(temp2, (int) result + "");
                        else
                            temp = temp.replace(temp2, result + "");
                    }

            }else if(temp.contains("(") ){
                    int L = temp.indexOf('(');
                legend = 0;
                double a;
                double b;
                for(int x=1;x<temp.length();x++){
                    if (x < L) continue;
                    if(temp.charAt(1)=='-')x=2;
                    if(temp.charAt(x)=='+'){
                        a = Double.parseDouble(temp.substring(L+1, x));
                        b = Double.parseDouble(temp.substring(x+1, temp.length()));
                        result =a+b;
                    }
                    else    if(temp.charAt(x)=='-'){
                        a = Double.parseDouble(temp.substring(L+1, x));
                        b = Double.parseDouble(temp.substring(x+1, temp.length()));
                        result =a-b;
                    }
                    else      if(temp.charAt(x)=='x'){
                        a = Double.parseDouble(temp.substring(L+1, x));
                        b = Double.parseDouble(temp.substring(x+1, temp.length()));
                        result =a*b;
                    }
                    else       if(temp.charAt(x)=='÷'){
                        a = Double.parseDouble(temp.substring(L+1, x));
                        b = Double.parseDouble(temp.substring(x+1, temp.length()));
                        if(b==0){
                            Toast.makeText(this, "can't divide by zero", Toast.LENGTH_LONG).show();
                        z=1;
                        }
                        else
                            result =a/b;
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
            }
          //  tx.setText(temp);
            if ((temp.contains("+")||temp.contains("-")||temp.contains("x")||temp.contains("÷"))&&ko!=1) {
                try {
                    double a;
                    double b;
                    for (int i = 1; i < temp.length(); i++) {
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
                            if (b == 0){
                                Toast.makeText(this, "can't divide by zero", Toast.LENGTH_LONG).show();
                            z=1;
                            }
                            else
                                result = a / b;
                        }
                    }
                    String h = result + "";
                    if (h.length() > 9)
                        tx.setTextSize(30);
                    if (h.endsWith(".0"))
                        tx.setText(String.format("%.0f", result));
                    else
                        tx.setText(result + "");
                } catch (Exception e) {
                    Toast.makeText(this, temp, Toast.LENGTH_LONG).show();
                }
            }
            else if(ko==1) {
                tx.setText(temp);
            }  else{
                String h = result + "";
                if (h.length() > 9)
                    tx.setTextSize(30);
                if (h.endsWith(".0"))
                    tx.setText(String.format("%.0f", result));
                else
                    tx.setText(result + "");
            }
            if(z==1)
                tx.setText("invalid operation");
            ko=0;
            z=0;
            result=0;
            legend=0;
            stat=true;
            kara=0;
        }catch (Exception e){}
    }
}
