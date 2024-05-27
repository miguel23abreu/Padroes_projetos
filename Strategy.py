# Interface para os métodos de pagamento
class PaymentStrategy:
    def process_payment(self, amount):
        pass

# Implementação do pagamento com cartão de crédito
class CreditCardPayment(PaymentStrategy):
    def process_payment(self, amount):
        print(f"Pagamento de R${amount} realizado com cartão de crédito.")

# Implementação do pagamento com PayPal
class PayPalPayment(PaymentStrategy):
    def process_payment(self, amount):
        print(f"Pagamento de R${amount} realizado com PayPal.")

# Implementação do pagamento por transferência bancária
class BankTransferPayment(PaymentStrategy):
    def process_payment(self, amount):
        print(f"Pagamento de R${amount} realizado por transferência bancária.")

class PaymentContext:
    def __init__(self, payment_strategy):
        self._payment_strategy = payment_strategy

    def process_payment(self, amount):
        self._payment_strategy.process_payment(amount)

# Exemplo de uso
if __name__ == "__main__":
    # Criando instâncias das estratégias de pagamento
    pagamento_via_cartao = CreditCardPayment()
    pagamento_via_paypal = PayPalPayment()
    pagamento_via_tranferencia_bancaria = BankTransferPayment()

    # Realizando pagamentos usando diferentes métodos
    payment_context = PaymentContext(pagamento_via_cartao)
    payment_context.process_payment(100)

    payment_context = PaymentContext(pagamento_via_paypal)
    payment_context.process_payment(150)

    payment_context = PaymentContext(pagamento_via_tranferencia_bancaria)
    payment_context.process_payment(200)
