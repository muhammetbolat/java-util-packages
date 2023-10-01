package com.bolat.util.tuple;

public final class DoublePair {
    private final double m_first;
    private final double m_second;

    public static DoublePair create(double first, double second)
    {
        return new DoublePair(first, second);
    }

    public DoublePair(double first, double second) {
        m_first = first;
        m_second = second;
    }

    public double getFirst() {
        return m_first;
    }

    public double getSecond() {
        return m_second;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof DoublePair && m_first == ((DoublePair)obj).m_first && m_second == ((DoublePair)obj).m_second;
    }

    @Override
    public String toString() {
        return String.format("{first : %f, second : %f}", m_first, m_second);
    }
}
