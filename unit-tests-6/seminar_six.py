import pytest
from unittest import mock


def find_avg(numbers: list) -> float:
    if not isinstance(numbers, list):
        raise TypeError("This object not list type")
    if not numbers:
        return 0
    return sum(numbers) / len(numbers)


def test_find_avg():
    assert find_avg([1, 2, 3]) == 2


def test_find_avg_list_is_empty():
    assert find_avg([]) == 0


def test_find_avg_one_element():
    assert find_avg([6]) == 6


def test_find_avg_type():
    with pytest.raises(TypeError):  # Перехватывает ошибку
        find_avg("4")


class Person:

    def __init__(self, balance):
        self.balance = balance

    def transfer_money(self, bank, amount):
        if amount <= 0 or amount > self.balance:
            raise ValueError("Sum not correct!")
        self.balance -= amount
        bank.receive_money(amount)


class Bank:
    def __init__(self):
        self.balance = 0

    def receive_money(self, amount):
        self.balance += amount


def test_person_bank_interaction():
    person = Person(1000)
    bank = Bank()
    person.transfer_money(bank, 500)
    assert bank.balance == 500  # and person.balance == 500
    assert person.balance == 500


def test_person_bank_mock_interaction():
    mock_bank = mock.Mock()
    person = Person(1000)
    person.transfer_money(mock_bank, 500)
    mock_bank.receive_money.assert_called_with(500)