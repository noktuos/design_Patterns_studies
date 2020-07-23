import com.google.common.base.Stopwatch;
import company.behaviour.chainofresponsability.Tarjeta;
import company.behaviour.command.CreditCard;
import company.behaviour.command.CreditCardActivateCommand;
import company.behaviour.command.CreditCardDesactivateCommand;
import company.behaviour.command.CreditCardInvoker;
import company.behaviour.interpreter.AndExpression;
import company.behaviour.interpreter.Expression;
import company.behaviour.interpreter.OrExpression;
import company.behaviour.interpreter.TerminalExpression;
import company.behaviour.iterator.CardList;
import company.behaviour.iterator.Iterator;
import company.behaviour.iterator.List;
import company.behaviour.mediator.ConcreteColleage1;
import company.behaviour.mediator.ConcreteColleage2;
import company.behaviour.mediator.ConcreteMediator;
import company.behaviour.memento.Article;
import company.behaviour.memento.ArticleMemento;
import company.behaviour.memento.Caretaker;
import company.behaviour.observer.Coche;
import company.behaviour.observer.MessagePublisher;
import company.behaviour.observer.Peaton;
import company.behaviour.observer.Semaforo;
import company.behaviour.state.MobileAlertStateContext;
import company.behaviour.state.Vibration;
import company.behaviour.strategy.Context;
import company.behaviour.strategy.LowerStrategyTextFormatter;
import company.behaviour.strategy.UpperStrategyTextFormatter;
import company.behaviour.templateMethod.*;
import company.creational.abstractFactory.AbstractFactory;
import company.creational.abstractFactory.Card;
import company.creational.abstractFactory.FactoryProvider;
import company.creational.abstractFactory.PaymentMethod;
import company.creational.factory.Payment;
import company.creational.factory.PaymentFactory;
import company.creational.factory.PaymentType;
import company.creational.prototype.PrototypeCard;
import company.creational.prototype.PrototypeFactory;
import company.structural.bridge.ClassicCreditCard;
import company.structural.bridge.SecureCreditCard;
import company.structural.bridge.UnSecuredCreditCard;
import company.structural.composite.CuentaAhorro;
import company.structural.composite.CuentaComponent;
import company.structural.composite.CuentaComposite;
import company.structural.composite.CuentaCorriente;
import company.structural.decorator.*;
import company.structural.facade.CreditMarket;
import company.structural.flywheight.Enemy;
import company.structural.flywheight.EnemyFactory;
import company.structural.proxy.Internet;
import company.structural.proxy.ProxyInternet;


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static company.creational.prototype.PrototypeFactory.CardType.AMEX;
import static company.creational.prototype.PrototypeFactory.CardType.VISA;

public class Main {
    public static void main(String[] args) {



//        PATRONES CREACIONALES
        testFactoryMethod();
        probarAbstractFactory();
        probarBuilder();
        probarPrototype();
        probarSingleton();

//        PATRONES DE COMPORTAMIENTO
        probarChainofresponsability();
        probarCommand();
        probarIterator();
        probarMediator();
        probarMemento();
        probarObserver();
        probarState();
        probarInterprete();
        probarStrategy();
        probarTemplate();
        probarVisitor();

//        STRUCTURAL PATTERN
        probarAdapter();
        probarBridge();
        probarComposite();
        probarDecorator();
        probarFacade();
        probarFlyweight();
        probarProxy();

    }

    private static void probarProxy(){
        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("udemy.com");
            internet.connectTo("facebook.com");
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
    private static void probarFlyweight(){
        for(int x=0;x<=15;x++){
            Enemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setWeapon(getRandomWeapon());
            enemy.lifePoints();
        }
    }
    private static String getRandomWeapon(){
        Random r = new Random();
        int randInt = r.nextInt(weaponType.length);
        return weaponType[randInt];

    }
    private static String getRandomEnemyType(){
        Random r = new Random();
        int randInt = r.nextInt(enemyType.length);
        return enemyType[randInt];

    }
    private static String[] enemyType={"Soldier","Detective"};
    private static String[] weaponType={"Pistol","Revolver","Assault Rifle","Sniper Rifle","resoltera","una piedrota","un perro de hule"};
    private static void probarFacade(){
        CreditMarket creditMarket= new CreditMarket();
        creditMarket.showCreditBlack();
        creditMarket.showCreditGold();
        creditMarket.showCreditSilver();
    }
    private static void probarDecorator(){
        Credit gold = new Gold();
        Credit blackInternationalPayment = new Black();
        blackInternationalPayment = new InternationalPaymentWrapper(blackInternationalPayment);

        Credit blackSecuredAndInternational = new Black();
        blackSecuredAndInternational = new InternationalPaymentWrapper(blackSecuredAndInternational);
        blackSecuredAndInternational = new SecureWrapper(blackSecuredAndInternational);

        System.out.println("---Tarjeta Gold con config---");
        gold.showCredit();
        System.out.println("---Tarjeta Black con config---");
        blackInternationalPayment.showCredit();
        System.out.println("---Tarjeta Gold con config---");
        blackSecuredAndInternational.showCredit();
    }
    private static void probarComposite(){
        CuentaComponent cuentaCorriente = new CuentaCorriente(1000.50,"Josue Torres Torres");
        CuentaComponent cuentaAhorro = new CuentaAhorro(20000,"Josue Torres Torres");

        CuentaComposite cuentaComposite = new CuentaComposite();
        cuentaComposite.addCuenta(cuentaCorriente);
        cuentaComposite.addCuenta(cuentaAhorro);

        cuentaComposite.showAccountName();
        cuentaComposite.getAmount();
    }
    private static void probarBridge(){
        company.structural.bridge.CreditCard classic = new ClassicCreditCard(new UnSecuredCreditCard() );
        classic.realizarPago();

        classic=new ClassicCreditCard((new SecureCreditCard()));
        classic.realizarPago();
    }
    private static void probarAdapter(){
        company.structural.adapter.CreditCard creditCard = new company.structural.adapter.CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
        creditCard.pay("silver");

    }
    private static void probarVisitor(){
        OfertaElement ofertaElement = new OfertaGasolina();
        ofertaElement.accept(new BlackCreditCardVisitor());

        ofertaElement= new OfertaVuelos();
        ofertaElement.accept(new ClassicCreditCardVisitor());
    }
    private static void probarTemplate(){
        company.behaviour.templateMethod.Payment payment = new Visa();
        payment.makePayment();
    }
    private static void probarStrategy(){
        Context context = new Context(new UpperStrategyTextFormatter());
        context.publishText("Este texto se convirtio a mayusculas a travez del algoritmo");

        context = new Context(new LowerStrategyTextFormatter());
        context.publishText("ESTE TEXTO SE CONVIRTIO A MINUS A RTAVEZ DE EL ALGORITMO");

    }
    private static void  probarInterprete(){
        TerminalExpression cero = new TerminalExpression("0");
        TerminalExpression uno = new TerminalExpression("1");

        Expression containBoolean = new OrExpression(cero,uno);
        Expression containsOneAndCero = new AndExpression(cero,uno);

        containBoolean.interpret("cero");
        System.out.println(containBoolean.interpret("cero"));
        System.out.println(containBoolean.interpret("0"));

        System.out.println(containsOneAndCero.interpret("0"));
        System.out.println(containsOneAndCero.interpret("0, 1"));
    }
    private static void probarState(){

        MobileAlertStateContext context = new MobileAlertStateContext();
        context.alert();
        context.alert();
        context.setState(new Vibration());
        context.alert();
        context.alert();

    }
    private static void probarObserver(){
        Coche coche = new Coche();
        Peaton peaton = new Peaton();
        MessagePublisher messagePublisher=new MessagePublisher();
        messagePublisher.attach(coche);
        messagePublisher.attach(peaton);
        messagePublisher.notifyUpdate(new Semaforo("ROJO_COCHE"));
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e);
        }
        messagePublisher.notifyUpdate(new Semaforo("VERDE_COCHE"));
    }
    private static void probarMemento(){
        Caretaker caretaker = new Caretaker();
        Article articulo = new Article("Diego Marin","El terror de los hombres yace dentro de si mismos");
        articulo.setText(articulo.getText()+" de volador");
        System.out.println(articulo.getText());

        caretaker.addMemento(articulo.createMemento());
        articulo.setText(articulo.getText()+"de nolan voladreño");
        System.out.println(articulo.getText());

        caretaker.addMemento(articulo.createMemento());
        ArticleMemento memento1 = caretaker.getMemento(0);
        ArticleMemento memento2 = caretaker.getMemento(1);

        System.out.println("============================================");
        articulo.restoreMemento(memento1);
        System.out.println(articulo.getText());
        System.out.println("============================================");

        articulo.restoreMemento(memento2);
        System.out.println(articulo.getText());
    }
    private static void probarMediator(){
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleage1 user1 = new ConcreteColleage1(mediator);
        ConcreteColleage2 user2 = new ConcreteColleage2(mediator);

        mediator.setUser1(user1);
        mediator.setUser2(user2);

        user1.send("hola soy user1");
        user2.send("hola soy user2");

    }
    private static void probarIterator(){
        company.behaviour.iterator.Card[] tarjetas = new company.behaviour.iterator.Card[5];
        tarjetas[0] = new company.behaviour.iterator.Card("Visa","000");
        tarjetas[1] = new company.behaviour.iterator.Card("Master Card","1231");
        tarjetas[2] = new company.behaviour.iterator.Card("Amex","12351");
        tarjetas[3] = new company.behaviour.iterator.Card("Santander","1241");
        tarjetas[4] = new company.behaviour.iterator.Card("Bankaool","13123151");
        List lista = new CardList(tarjetas);
        Iterator iterator = lista.iterator();

        while(iterator.hasNext()){
            company.behaviour.iterator.Card tarjeta = (company.behaviour.iterator.Card)iterator.next();
            System.out.println(tarjeta.getType());
            System.out.println(tarjeta.getNumber());
        }
    }
    private static void probarCommand(){
        CreditCard creditCard = new CreditCard();
        CreditCard creditCardDeactivate = new CreditCard();

        CreditCardInvoker invoker = new CreditCardInvoker();
        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();
        System.out.println("-----------------------------------------");
        invoker.setCommand(new CreditCardDesactivateCommand(creditCard));
        invoker.run();
    }
    private static void probarChainofresponsability(){
        Tarjeta tarjeta = new Tarjeta();
        tarjeta.creditCardRequest(50001,"hola.txt");
    }
    private static void probarSingleton(){
        company.creational.singleton.Card.getINSTANCE().setCardNumber("111-222-333-444");
        System.out.println( company.creational.singleton.Card.getINSTANCE().getCardNumber());

    }
    private static void probarPrototype(){
        PrototypeFactory.loadCard();
        try{
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();

            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCard();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
    private static void testFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(PaymentType.CREDITCARD);
        payment.doPayment();
    }
    private static void probarAbstractFactory(){
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
        Card tarjeta = (Card) abstractFactory.create("VISA");
        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("PAYPAL");
        System.out.println("Una tarjeta de tipo "+ tarjeta.getCardType()+" con el numero de tarjeta: "+ tarjeta.getCardNumber()+ " con el metodo de pago: " + paymentMethod.doPayment());
    }
    private static void probarBuilder(){
        company.creational.Builder.Card card = new company.creational.Builder.Card.CardBuilder("Debit","000-000-000-000")
                .name("ALBERTO")
                .expires(2030)
                .credit(true)
                .build();

        System.out.println(card);
        company.creational.Builder.Card card2= new company.creational.Builder.Card.CardBuilder("AMEX","1111-1111-1111-1111")
                .build();
        System.out.println(card2);
    }
}













