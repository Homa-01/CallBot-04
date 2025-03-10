require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Hello
        intent!: /привет
        a: Здравствуйте! Я виртуальный консультант. Чем могу помочь?

    state: Bye
        intent!: /пока
        a: До свидания! Хорошего дня.
 
    state: CreditPayment
        intent!: /как оплатить кредит
        a: Есть два способа оплаты займа: безналичным и наличными. Как вам удобнее? 

    state: CashlessPayment
        intent!: /безналичным
        a: Вы можете оплатить кредит в приложении Freedom SuperApp (без комиссии) или сделать P2P-перевод с приложений других банков при наличии карты FreePay.

    state: CashPayment
        intent!: /наличными
        a: Оплатить займ наличными можно в кассах нашего офиса или через терминалы оплаты.

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}